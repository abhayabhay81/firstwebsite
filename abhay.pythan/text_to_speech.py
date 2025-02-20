import pyttsx3
engine = pyttsx3.init()
engine.say("this is amazing text")
engine.runAndWait()

#  pip install pyttsx3

"""
import pyttsx3
engine = pyttsx3.init()

# rate
rate = engine.getProperty('rate')
print(rate)
engine.setProperty('rate',120)

# volume
volume = engine.getProperty('volume')
print(volume)
engine.setProperty('volume',120)

#vices
voices = engine.getProperty('voices')
#engine.setProperty('voice',voices[0].id)
engine.setProperty('voice',voices[1].id)

engine.setProperty('volume',120)

engine.say(" i love  you abhay")
engine.runAndWait()
"""