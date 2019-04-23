/**
 * ��ָOFFER ��3 �ҳ��������ظ�������
 *
 */
public class Duplicate {

    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, nums[i], nums[nums[i]]);
            }
        }
        return false;
    }

    private void swap ( int[] num, int a, int b) {
        int swap = num[a];
        num[a] = num[b];
        num[b] = swap;
    }
}