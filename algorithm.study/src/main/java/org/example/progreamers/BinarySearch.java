package org.example.progreamers;

/**
 * 바이너리써치(이진 탐색)
 * 1) 바이너리 서치를 하기 전에 최초에 값은 정렬 되어 있어야 한다. ( 내림차순)
 * 2) 중간값을 가지고 타겟 값보다 높은지 낮은지 확인하여 이동한다.
 * 3) 반복문을 돌며 조건식에 맞게 선회
 *  목표 값을 찾지 못하면 -1을 반환한다.
 *
 * 엣지 케이스
 *  - 중앙 인덱스 즉 mid값 을 구할때 오버 플로우가 발생될 수 있다.
 *  - 이에 수학적인 동치성을 활용하여 오버 플러우가 발생 하지 않도록 한다.
 */
public class BinarySearch {


    public int search(int[] nums, int target) {

        // 탐색 범위의 시작점을 0으로 초기화
        int low  = 0;
        // 탐색 범위의 끝점을 배열의 마지막 인덱스로 초기화
        int high = nums.length -1;

        // low가 high보다 작거나 같을 때까지 반복 (탐색 범위가 유효한 동안)
        while (low <= high) {
            // 중간 인덱스 계산: 오버플로우 방지를 위해 low + (high - low) / 2 사용
            // (low + high) / 2 대신 사용하여 큰 수의 합으로 인한 오버플로우 방지
            int mid = low + (high - low) /2;

            // 중간값이 목표값과 같으면 해당 인덱스 반환
            if ( nums [mid] == target) {
                return mid;
            }
            // 중간값이 목표값보다 작으면 오른쪽 절반을 탐색
            else if ( nums[mid] < target) {
                low = mid + 1;  // 탐색 범위를 중간값의 오른쪽으로 좁힘
            }
            // 중간값이 목표값보다 크면 왼쪽 절반을 탐색
            else {
                high = mid -1;  // 탐색 범위를 중간값의 왼쪽으로 좁힘
            }

        }

        // 목표값을 찾지 못한 경우 -1 반환
        return -1;

    }

    public static void main(String[] args) {


        BinarySearch bs = new BinarySearch();
        int[]  nums = new int[]{1,2,3,4,5,6,7,8,9};
        int result = bs.search(nums,3);

        System.out.println("index  순서 : " + result);
        System.out.println("찾은 값 : " + nums[result]);



    }
}
