import java.util.Scanner;

public class IIRFilter {

    private final int order;
    private final double[] coeffsA;
    private final double[] coeffsB;
    private final double[] historyX;
    private final double[] historyY;

    /**
     * Construct an IIR Filter
     *
     * @param order the filter's order
     * @throws IllegalArgumentException if order is zero or less
     */
    public IIRFilter(int order) throws IllegalArgumentException {
        if (order < 1) {
            throw new IllegalArgumentException("order must be greater than zero");
        }

        this.order = order;
        coeffsA = new double[order + 1];
        coeffsB = new double[order + 1];

        // Sane defaults
        coeffsA[0] = 1.0;
        coeffsB[0] = 1.0;

        historyX = new double[order];
        historyY = new double[order];
    }

    /**
     * Set coefficients
     *
     * @param aCoeffs Denominator coefficients
     * @param bCoeffs Numerator coefficients
     * @throws IllegalArgumentException if {@code aCoeffs} or {@code bCoeffs} is
     * not of size {@code order}, or if {@code aCoeffs[0]} is 0.0
     */
    public void setCoeffs(double[] aCoeffs, double[] bCoeffs) throws IllegalArgumentException {
        if (aCoeffs.length != order) {
            throw new IllegalArgumentException("aCoeffs must be of size " + order + ", got " + aCoeffs.length);
        }

        if (aCoeffs[0] == 0.0) {
            throw new IllegalArgumentException("aCoeffs.get(0) must not be zero");
        }

        if (bCoeffs.length != order) {
            throw new IllegalArgumentException("bCoeffs must be of size " + order + ", got " + bCoeffs.length);
        }

        for (int i = 0; i <= order; i++) {
            coeffsA[i] = aCoeffs[i];
            coeffsB[i] = bCoeffs[i];
        }
    }

    /**
     * Process a single sample
     *
     * @param sample the sample to process
     * @return the processed sample
     */
    public double process(double sample) {
        double result = 0.0;

        // Process
        for (int i = 1; i <= order; i++) {
            result += (coeffsB[i] * historyX[i - 1] - coeffsA[i] * historyY[i - 1]);
        }
        result = (result + coeffsB[0] * sample) / coeffsA[0];

        // Feedback
        for (int i = order - 1; i > 0; i--) {
            historyX[i] = historyX[i - 1];
            historyY[i] = historyY[i - 1];
        }

        historyX[0] = sample;
        historyY[0] = result;

        return result;
    }

    //Driver function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of orders : ");
        int order = sc.nextInt();
        System.out.println("Enter the number of denominator coeffs : ");
        int a = sc.nextInt();
        System.out.println("Enter the number of numerator coeffs : ");
        int b = sc.nextInt();
        double aCoeffs[] = new double[a];
        double bCoeffs[] = new double[b];
        System.out.println("Enter the coefficients for denominator : ");
        for(int i = 0 ; i < a ; i++){
            aCoeffs[i] = sc.nextDouble();
        }
        System.out.println("Enter the coefficients for numerator : ");
        for(int i = 0 ; i < b ; i++){
            bCoeffs[i] = sc.nextDouble();
        }
        IIRFilter obj = new IIRFilter(order);
        System.out.println("Enter the sample : ");
        double sample = sc.nextDouble();
        obj.setCoeffs(aCoeffs , bCoeffs);
        System.out.println("The result : " + obj.process(sample));
    }
}
