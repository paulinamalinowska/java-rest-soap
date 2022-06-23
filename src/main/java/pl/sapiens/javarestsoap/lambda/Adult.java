package pl.sapiens.javarestsoap.lambda;

@FunctionalInterface
interface Adult {
    boolean isAdult(int age);

    // boolean myFriend(int age) - to zepsuloby nam bo lambda nie wiedzialaby ktora ma funkcje uzyc.
    // dlatego adnotacja musi byc jak mamy jedna metode
    //wiec dodali opcje default

    default boolean myFriend(int age) {
        return false;
    }


}
