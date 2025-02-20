#pip install speechrecognition
#pip install wheel
#pip install pipwin
#pip install pyaudio
#pip install pyttsx3


import speech_recognition as sr
import pyttsx3 as py
# The Recognizer is initialized.
ur = sr.Recognizer()
engine = py.init()

while (1):
    try:

        with sr.Microphone() as uv:

              ur.adjust_for_ambient_noise(uv, duration=0.5)

            # The Program listens to the user voice input.
              ui = ur.listen(uv)
              ut = ur.recognize_google(ui)
              ut = ut.lower()
              if(ut == "exit"):
                print(ut)
                engine.say(ut)
                engine.runAndWait()

    except KeyboardInterrupt:
        print(' Terminating the Program !!!')
        engine.say(' Terminating the Program !!!')
        engine.runAndWait()
        exit(0)

    except sr.UnknownValueError:
        print(
            " audio cannot be matched to text !!!")
        engine.say( "audio cannot be matched to text !!!")
        engine.runAndWait()