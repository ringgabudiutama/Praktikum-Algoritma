public class Datadosen {
    public void dataAllDosen(Dosen[] arrayOfDosen) {
        for (Dosen d : arrayOfDosen) {
            d.printInfo();
            System.out.println("---------------------------------");
        }
    }

    public void numberOfLecturersPerGender(Dosen[] arrayOfDosen) {
        int male = 0, female = 0;
        for (Dosen d : arrayOfDosen) {
            if (d.gender) male++;
            else female++;
        }
        System.out.println("Number of Male Lecturers   : " + male);
        System.out.println("Number of Female Lecturers : " + female);
    }

    public void averageAgeOfLecturersPerGender(Dosen[] arrayOfDosen) {
        int maleCount = 0, femaleCount = 0;
        int maleSum = 0, femaleSum = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.gender) {
                maleCount++;
                maleSum += d.age;
            } else {
                femaleCount++;
                femaleSum += d.age;
            }
        }

        double maleAvg = (maleCount == 0) ? 0 : (double) maleSum / maleCount;
        double femaleAvg = (femaleCount == 0) ? 0 : (double) femaleSum / femaleCount;

        System.out.println("Average Age (Male)   : " + maleAvg);
        System.out.println("Average Age (Female) : " + femaleAvg);
    }

    public void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen oldest = arrayOfDosen[0];
        for (Dosen d : arrayOfDosen) {
            if (d.age > oldest.age) oldest = d;
        }

        System.out.println("Oldest Lecturer:");
        oldest.printInfo();
    }

    public void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen youngest = arrayOfDosen[0];
        for (Dosen d : arrayOfDosen) {
            if (d.age < youngest.age) youngest = d;
        }

        System.out.println("Youngest Lecturer:");
        youngest.printInfo();
    }
}