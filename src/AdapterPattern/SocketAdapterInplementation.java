package AdapterPattern;

public class SocketAdapterInplementation extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get40Volts() {
       Volt volt = getVolt();
       return convert(volt,3);
    }

    @Override
    public Volt get12Volts() {
        Volt volt = getVolt();
        return convert(volt,10);
    }

    public Volt convert(Volt volt,int i){
        return new Volt (volt.getVolts()/i);
    }

    public static void main(String args[]){
        SocketAdapterInplementation socketAdapterInplementation = new SocketAdapterInplementation();
        Volt volt = socketAdapterInplementation.get12Volts();
        System.out.println(volt.getVolts());
    }
}

