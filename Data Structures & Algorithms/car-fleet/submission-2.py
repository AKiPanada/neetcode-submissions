class Solution:
    def carFleet(
    self, 
    target: int, 
    position: List[int], 
    speed: List[int]
    ) -> int:
        
        cars: list[tuple[int,int]] = sorted(
            zip(position, speed),
            reverse = True
        )

        stack: list[int] = []
        
        for p, s in cars:
            time = (target - p) / s
            if not stack or time > stack[-1]:
                stack.append(time)
        
            
        return len(stack)
            