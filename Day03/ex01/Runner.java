public class Runner {
    private boolean flag;
    private int count;

    public Runner(int count) {
        this.count = count;
    }

    
    public synchronized void runEgg() {
        for (int i = 0; i < count; ++i) {
			while (flag) {
				try {
					wait();
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			System.out.println("Egg");
			flag = true;
			notify();
		}
    }

	public synchronized void runHen() {
        for (int i = 0; i < count; ++i) {
			while (!flag) {
				try {
					wait();
				} catch (InterruptedException e) {e.printStackTrace(); }
			}
			System.out.println("Hen");
			flag = false;
			notify();
		}
    }
}