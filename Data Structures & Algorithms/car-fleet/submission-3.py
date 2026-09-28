class Solution:
    def carFleet(
    self, 
    target: int, 
    position: List[int], 
    speed: List[int]
    ) -> int:
        
        # new approach: just look at speeds and positions
        # avoid sorting/reversing data orders to better performance

        cars: list[float] = [0] * target

        for p, s in zip(position, speed):
            cars[p] = (target - p) / s
        
        res: int = 0
        prevTime: float = 0
        
        for p in range(target-1, -1, -1): # iterate backwards through positions
            t: float = cars[p]
            if t > prevTime:
                res += 1
                prevTime = t


        return res