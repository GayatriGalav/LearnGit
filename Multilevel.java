class telephone {
    void Dial() {
        System.out.println("DIALING NUMBER");
    }
}

class nokia extends telephone {
    void RecordAudio() {
        System.out.println("RECORDING AUDIO");
    }

    void camera() {
        System.out.println("TAKING PICS");
    }
}

class smartphone extends nokia {
    void youtube() {
        System.out.println("PLAYING VIDEOS");
    }

    void connectWiFi() {
        System.out.println("CONNECTING TO WiFi NETWORK");
    }
}

public class Multilevel {
    public static void main(String args[]) {
        smartphone samsung = new smartphone();
        samsung.Dial();
        samsung.youtube();
    }
}
