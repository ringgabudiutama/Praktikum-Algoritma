package JOBSHEET7;

public class Searchstudent {
    Students[] listStd = new Students[5];
    int idx;

    void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    void display() {
        System.out.println("Entire Student Data");
        for (Students students : listStd) {
            students.display();
            System.out.println("-----------------------------");
        }
    }

    int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listStd[mid].nim) {
                return mid;
            } else if (listStd[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t: " + listStd[pos].nim);
            System.out.println("Name \t: " + listStd[pos].name);
            System.out.println("Age \t: " + listStd[pos].age);
            System.out.println("IPK \t: " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }
}