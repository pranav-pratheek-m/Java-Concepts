
class AgeException extends Exception {

    AgeException(String str) {
        super(str);
    }
}

class AgeRangeException extends Exception {

    AgeRangeException(String str) {
        super(str);
    }
}

class VoterAge {
    static void getEligibility(String arg) throws AgeException, AgeRangeException, Exception {

        if (arg == null) {
            throw new Exception("Please specify the age");
        }

        int age = Integer.parseInt(arg);

        if (age < 0 || age > 100) {
            String str = "\nPlease enter age between 0 and 100";
            throw new AgeRangeException(str);
        }

        if (age < 18) {
            String str = "\nYou are a minor.Not eligible for voting yet";
            throw new AgeException(str);
        }

        System.out.println("\nYou are a major.You are eligible for voting");

    }
}

public class VoterAgeException {
    public static void main(String[] args) {
        try {
            // String str = null;
            // VoterAge.getEligibility(str);

            VoterAge.getEligibility(args[0]);
        } catch (AgeException e) {
            System.out.println("\nSorry.. " + e.getMessage());
        } catch (AgeRangeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("\nPlease enter an integer format only");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("\nVoting is the soul of democracy");
        }
    }
}