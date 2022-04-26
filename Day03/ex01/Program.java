public class Program {
	public static void main(String[] args) {
		int count = 0; 

    	if (args.length != 1 || !args[0].startsWith("--count=")) {
       	 	System.err.println("usage: java Program --count=<number>");
        	System.exit(-1);
        }

        try {
            count = Integer.parseInt(args[0].substring(8));
        } catch (NumberFormatException e) {
            System.err.println("usage: java Program --count=<number>");
            System.exit(-1);
        }
		
		Runner runner = new Runner(count);
		Thread Egg = new Thread(new Runnable() {
			@Override
			public void run() {
				runner.runEgg();
			}
		});
		Thread Hen = new Thread(new Runnable() {
			@Override
			public void run() {
				runner.runHen();
			}
		});

        Egg.start();
        Hen.start();

    }
}