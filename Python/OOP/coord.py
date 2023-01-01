class point():
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
        self.coords = (self.x, self.y)

    def length(self):
        import math
        return math.sqrt(self.x**2 + self.y**2)

    def __lt__(self, p):
        return self.length() < p.length()

    def __le__(self, p):
        return self.length() <= p.length()
    
    def __gt__(self, p):
        return self.length() > p.length()
    
    def __ge__(self, p):
        return self.length() >= p.length()
    
    def __eq__(self, p):
        return self.length() == p.length()

    def move(self, x, y):
        self.x = self.x + x
        self.y = self.y + y
    
    def __add__(self, p):
        return point(self.x + p.x, self.y + p.y)

    def __sub__(self, p):
        return point(self.x - p.x, self.y - p.y)

    def __mul__(self, p):
        return self.x * p.x + self.y * p.y

    def __str__(self):
        return '(' + str(self.x) + ', ' + str(self.y) + ')'


p1 = point(3,4)
p2 = point(7,2)
p3 = point(5,3)
p4 = point(1,5)

p5 = p1 + p3
p6 = p4 - p2
p7 = p1 *  p2

print(p1, p2, p3, p4)
print('\n')
print(p5, p6, p7)

print(p1 > p2)
print(p3 <= p4)
print(p3 > p1)