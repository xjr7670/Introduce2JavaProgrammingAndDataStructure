package ch4;

/**
 * Estimate areas
 */

public class Practice3 {
    public static void main(String[] args) {
        // 1. The coordinates of these four cities
        double AtlantaX = Math.toRadians(33.7489954);
        double AtlantaY = Math.toRadians(-84.3879824);
        double OrlandoX = Math.toRadians(38.5383355);
        double OrlandoY = Math.toRadians(-81.3792365);
        double SavannahX = Math.toRadians(32.0835407);
        double SavannahY = Math.toRadians(-81.0998342);
        double CharlotteX = Math.toRadians(35.2270869);
        double CharlotteY = Math.toRadians(-80.8431267);

        // 2. Compute the area
        // distances between all cities
        double AtSaDist = 6371.01 * Math.acos(Math.sin(AtlantaX) * Math.sin(SavannahX) +
                Math.cos(AtlantaX) * Math.cos(SavannahX) * Math.cos(AtlantaY - SavannahY));
        double AtChDist = 6371.01 * Math.acos(Math.sin(AtlantaX) * Math.sin(CharlotteX) +
                Math.cos(AtlantaX) * Math.cos(CharlotteX) * Math.cos(AtlantaY - CharlotteY));
        double ChSaDist = 6371.01 * Math.acos(Math.sin(CharlotteX) * Math.sin(SavannahX) +
                Math.cos(CharlotteX) * Math.cos(SavannahX) * Math.cos(CharlotteY - SavannahY));
        double AtOrDist = 6371.01 * Math.acos(Math.sin(AtlantaX) * Math.sin(OrlandoX) +
                Math.cos(AtlantaX) * Math.cos(OrlandoX) * Math.cos(AtlantaY - OrlandoY));
        double OrSaDist = 6371.01 * Math.acos(Math.sin(OrlandoX) * Math.sin(SavannahX) +
                Math.cos(OrlandoX) * Math.cos(SavannahX) * Math.cos(OrlandoY - SavannahY));

        // Area 1
        double s1 = (AtSaDist + AtChDist + ChSaDist) / 2;
        double area1 = Math.pow(s1 * (s1 - AtSaDist) * (s1 - AtChDist) * (s1 - ChSaDist), 0.5);

        double s2 = (AtSaDist + AtOrDist + OrSaDist) / 2;
        double area2 = Math.pow(s2 * (s2 - AtSaDist) * (s2 - AtOrDist) * (s2 - OrSaDist), 0.5);

        double area = area1 + area2;

        // 3. Display result
        System.out.printf("The area of this four cities' rectangle is %f", area);

    }
}
