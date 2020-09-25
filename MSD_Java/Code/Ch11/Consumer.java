/**
 * The consumer side of the producer/consumer problem.
 * This thread will process a stream of integers geenrated
 * by a producer one integer at a time.  The end of the
 * integer stream is marked with a -1.
 */

public class Consumer extends Thread {

    private Buffer producer;  // The buffer connected to the producer

    /**
     * Create a new consumer.
     *
     * @param buf the buffer that is connected to the producer.
     */

    public Consumer( Buffer buf ) {
	producer = buf;
    }

    /**
     * Print a stream of integers generated by a producer.
     * The end of the stream is marked with a -1.
     */

    public void run() {
	int item = 0;

	while ( ( item = producer.remove() ) != -1 ) {
	    System.out.println( item );
	}
    }

} // Consumer
