import collections
from collections import namedtuple

marks = namedtuple('marks', [ 'm1' ,'m2', 'm3' ])

abc = marks(45, 45, 43)
print(abc)
print(abc.m1, abc.m3)

abc = abc._replace(m2=41)
print(abc)

xyz = marks(31, 42, 48)
print(xyz)
