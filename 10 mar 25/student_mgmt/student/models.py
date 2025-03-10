from django.db import models

# Create your models here.
class Student(models.model):
    
   sname = models.Charfield(max_length=100)
   sclass = models.Charfield(max_length=10)
   ssection = models.Charfield(max_length=10)
   sgender = models.Charfield(max_length=10)
   sdob = models.Datefield