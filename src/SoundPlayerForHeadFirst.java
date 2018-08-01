import javax.sound.midi.*;

public class SoundPlayerForHeadFirst {
    public static void main(String args[]){
        SoundPlayerForHeadFirst soundPlayerForHeadFirst = new SoundPlayerForHeadFirst();
        soundPlayerForHeadFirst.play();
    }
    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence sequence = new Sequence(Sequence.PPQ,4);

            Track track = sequence.createTrack();

            ShortMessage message = new ShortMessage();
            message.setMessage(144,1,120,100);
            MidiEvent noteOn= new MidiEvent(message,1);
            track.add(noteOn);

            ShortMessage message1 = new ShortMessage();
            message1.setMessage(144,1,120,100);
            MidiEvent noteOff= new MidiEvent(message1,20);
            track.add(noteOff);

            player.setSequence(sequence);
            player.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
