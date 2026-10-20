class Solution:
  def findMin(self, nums: list[int]) -> int:
    # base case: already in order
    if nums[0] < nums[-1]:
      return nums[0]

    length = len(nums)
    li, ri = 0, length-1

    while li < ri:
      mid: int = li + (ri - li) // 2
      if nums[mid] > nums[ri]:
        li = mid + 1
      else:
        ri = mid

    return nums[li]