#pip install speechrecognition
#pip install wheel
#pip install pipwin
#pip install pyaudio

import speech_recognition as sr

# The Recognizer is initialized.
UserVoiceRecognizer = sr.Recognizer()

while (1):
    try:

        with sr.Microphone() as UserVoiceInputSource:

            UserVoiceRecognizer.adjust_for_ambient_noise(UserVoiceInputSource, duration=0.5)

            # The Program listens to the user voice input.
            UserVoiceInput = UserVoiceRecognizer.listen(UserVoiceInputSource)

            UserVoiceInput_converted_to_Text = UserVoiceRecognizer.recognize_google(UserVoiceInput)
            UserVoiceInput_converted_to_Text = UserVoiceInput_converted_to_Text.lower()
            print(UserVoiceInput_converted_to_Text)

    except KeyboardInterrupt:
        print('A KeyboardInterrupt encountered; Terminating the Program !!!')
        exit(0)

    except sr.UnknownValueError:
        print(" noises detected OR the recognized audio cannot be matched to text !!!")


"""
import speech_recognition as sr
# The Recognizer is initialized.
ur = sr.Recognizer()

while (1):
    try:

        with sr.Microphone() as uv:

            ur.adjust_for_ambient_noise(uv, duration=0.5)

            # The Program listens to the user voice input.
            ui = ur.listen(uv)

            ut = ur.recognize_google(ui)
            ut = ut.lower()
            print(ut)

    except KeyboardInterrupt:
        print('A KeyboardInterrupt encountered; Terminating the Program !!!')
        exit(0)

    except sr.UnknownValueError:
        print(
            "No User Voice detected OR unintelligible noises detected OR the recognized audio cannot be matched to text !!!")"""