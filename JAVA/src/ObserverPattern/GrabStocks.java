package ObserverPattern;

public class GrabStocks {
    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAPPLEPrice(757.60);
        stockGrabber.setPIXELPrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(200.00);
        stockGrabber.setAPPLEPrice(700.60);
        stockGrabber.setPIXELPrice(600.40);

        stockGrabber.unregister(observer1);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAPPLEPrice(757.60);
        stockGrabber.setPIXELPrice(676.40);

        Runnable getIBM = new GetTheStock(stockGrabber,2,"IBM",300.00);
        Runnable getAPPLE = new GetTheStock(stockGrabber,2,"APPLE",800.60);
        Runnable getPIXEL = new GetTheStock(stockGrabber,2,"PIXEL",900.40);

        new Thread(getIBM).start();
        new Thread(getAPPLE).start();
        new Thread(getPIXEL).start();
    }
}
