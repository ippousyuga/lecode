package May;

public class test {
    public static void main(String[] args){
        String a = "abaab";
        String b = "issipi";
        int [] nums = {2,3};
        int target = 2;
        Remove_Element remove_element = new Remove_Element();
        int result = remove_element.removeElement(nums, target);
        System.out.println(result);

    }
}
