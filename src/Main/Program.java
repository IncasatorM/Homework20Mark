package Main;

import Models.Androids;
import Models.Iphones;
import Repository.Smartphones;

public class Program {
    public static void main(String[] args) {
        Iphones iphones = new Iphones("Iphones 10", 30000.0);
        Androids androids = new Androids("Samsung 15", 12000.0);
        Smartphones smartphonesAndroid = new Androids("Sony 12", 23000);
        Smartphones smartphonesIphone = new Androids("Iphone 16", 70000);




        iphones.internet();
        iphones.call();
        iphones.sms();
        iphones.showOperationSystem();

        smartphonesIphone.call();
        smartphonesIphone.internet();
        smartphonesIphone.sms();
        smartphonesIphone.internet();

        getSmatphoneAllMethods(iphones);
        getSmatphoneAllMethods(androids);
        getSmatphoneAllMethods(smartphonesAndroid);

    }

    public static void getSmatphoneAllMethods(Smartphones smartphones){
        smartphones.showOperationSystem();
        smartphones.sms();
        smartphones.call();
        smartphones.internet();
    }

}
