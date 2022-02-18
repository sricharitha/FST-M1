class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print("{} {} is moving.".format(self.manufacturer, self.model))
    def stop(self):
        print("{} {} has stopped.".format(self.manufacturer, self.model))

c1 = Car("Toyota", "Corolla", "2015", "Manual", "White")
c2 = Car("Maruti", "800", "2013", "Manual", "Red")
c3 = Car("Suzuki", "Swift", "2017", "Automatic", "Black")

c1.accelerate()
c2.stop()
