import pyttsx3
engine = pyttsx3.init()
rate = engine.getProperty('rate')
voices = engine.getProperty('voices')
# engine.setProperty('rate',120)
#engine.setProperty('voice',voices[0].id)
engine.setProperty('voice',voices[1].id)
engine.say("your name is akif ali")
engine.runAndWait()
