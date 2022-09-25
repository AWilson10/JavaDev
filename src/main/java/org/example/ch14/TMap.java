package org.example.ch14;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
    private String sectionNo;
    private String lectureNo;
    public Code(String sectionNo, String lectureNo) {
        super();
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }
    public String getSectionNo() {
        return sectionNo;
    }
    public String getLectureNo() {
        return lectureNo;
    }
    @Override
    public String toString() {
        return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
    }
    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo()+o.getLectureNo();
        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Code other = (Code) obj;
        if (lectureNo == null) {
            if (other.lectureNo != null)
                return false;
        } else if (!lectureNo.equals(other.lectureNo))
            return false;
        if (sectionNo == null) {
            if (other.sectionNo != null)
                return false;
        } else if (!sectionNo.equals(other.sectionNo))
            return false;
        return true;
    }
}

public class TMap {

    public static void main(String[] args) {
        Map<Code,String> lectures = new TreeMap<>();
        lectures.put(new Code("S01","L03"), "Generics");
        lectures.put(new Code("S01","L01"), "Files under Java");
        lectures.put(new Code("S02","L03"), "Network programming");
        lectures.put(new Code("S01","L07"), "OOPS");
        lectures.put(new Code("S01","L05"), "Methods");
        lectures.put(new Code("S01","L03"), "Expressions");

        for(Map.Entry<Code, String> entry: lectures.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        Code code1 = new Code("S10", "L01");
        Code code2 = new Code("S10", "L01");
        System.out.println(code1.hashCode() + "    " + code2.hashCode() + "    " + code1.equals(code2));

        // search with the key and get the value
        System.out.println(lectures.get(new Code("S01", "L03")));

        // search for key using the value
        Code code = null;
        for(Map.Entry<Code,String> entry: lectures.entrySet()) {
            if(entry.getValue().equals("OOPS")) {
                code = entry.getKey();
            }
        }
        System.out.println("The key for the vale \"OOPS\" "+ code);
    }

}
