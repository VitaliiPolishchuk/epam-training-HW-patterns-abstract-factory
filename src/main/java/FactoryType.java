public enum FactoryType {
    ENGLISH,
    SPAIN;

    public static AbstractFactory getFactory(FactoryType factoryType){
        switch(factoryType){
            case SPAIN:
                return new SpainFactory();
            default:
                return new EnglishFactory();
        }
    }
}
