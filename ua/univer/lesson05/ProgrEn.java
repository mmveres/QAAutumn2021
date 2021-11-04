package ua.univer.lesson05;

enum SortEnum {ASC, DESC}

public class ProgrEn {
    public static boolean isSort(SortEnum se, int[] arr){
            if (se == SortEnum.ASC){
                System.out.println("Desc");
                return true;
            }

            else {
                if (se == SortEnum.DESC)
                    System.out.println("Desc");
                return false;
            }

        }
        public static void main(String[] args) {
            SortEnum se = SortEnum.ASC;
            int [] arr = {1,2,3,4,5,4};
            isSort(se, arr);
    }

}
