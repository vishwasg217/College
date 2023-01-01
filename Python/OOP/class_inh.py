class Animal(object):
    def __init__(self, anim, name, age): #self refers to the variable the class is initialized tp
        self.anim = anim
        self.name = name
        self.age = age 
    
    def speak(self):
        print('Hi, I am a', self.anim, 'named', self.name, ', and I am', self.age, ' years old\n')

class dog(Animal):
    def __init__(self, anim, name, age, breed):
        super().__init__(anim, name, age)   #it automatically does the work done in line 3,4,5
        self.breed = breed 

    def speak(self):
        return super().speak()

    def sound(self):
        print('This is how I sound: WOOF! WOOF!!\n')

class cat(Animal):
    def __init__(self, anim, name, age, color):
        super().__init__(anim, name, age)
        self.color = color

    def speak(self):
        return super().speak()

    def sound(self):
        print('This is how I sound: MEEEOOWW!!\n')

Rio = dog('Dog', 'Rio', '2', 'Beagle')
Rio.speak()
Rio.sound()

Charlie = cat('Cat', 'Charlie', '4', 'Brown')
Charlie.speak()
Charlie.sound()

