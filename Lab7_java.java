class BMS extends Thread {

    synchronized public void run() {
        for (int i = 0; i < 5; i++)

            try {
                sleep(10000);
                System.out.println("bms college of engineering");

            } catch (InterruptedException e)

            {
                System.out.println(e);
            }

    }
}

class CSE extends Thread {
    synchronized public void run() {
        for (int i = 0; i < 5; i++)

            try {

                sleep(2000);
                System.out.println("cse");

            } catch (InterruptedException e)

            {
                System.out.println(e);
            }
    }
}

class Threading {
    public static void main(String args[]) {
        BMS B = new BMS();
        CSE C = new CSE();
        B.start();
        C.start();

    }

}
