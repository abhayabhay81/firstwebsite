import pyttsx3
import speech_recognition as sr
import datetime
import wikipedia
import webbrowser
import os

# Initialize text to speech engine
engine = pyttsx3.init()

def speak(audio):
    engine.say(audio)
    engine.runAndWait()

def wish_me():
    hour = int(datetime.datetime.now().hour)
    if 0 <= hour < 12:
        speak("Good Morning!")
    elif 12 <= hour < 18:
        speak("Good Afternoon!")
    else:
        speak("Good Evening!")
    speak("I am Jarvis, how may I assist you?")

def take_command():
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        speak("Listening...")
        recognizer.pause_threshold = 1
        audio = recognizer.listen(source)
    try:
        speak("Recognizing...")
        print("Recognizing...")
        query = recognizer.recognize_google(audio, language='en-in')
        print(f"User said: {query}")
    except Exception as e:
        print("Say that again, please...")
        return "None"
    return query

if __name__ == "__main__":
    wish_me()
    while True:
        query = take_command().lower()
        if 'wikipedia' in query:
            speak('Searching Wikipedia...')
            query = query.replace("wikipedia", "")
            results = wikipedia.summary(query, sentences=2)
            speak("According to Wikipedia")
            print(results)
            speak(results)
        elif 'open youtube' in query:
            speak("according to youtube")
            webbrowser.open("youtube.com")
        elif 'open google' in query:
            speak("according to google")
            webbrowser.open("google.com")
        elif 'play music' in query:
            music_dir = 'C:\\Users\\YourUsername\\Music'  # Change this to your music directory
            songs = os.listdir(music_dir)
            os.startfile(os.path.join(music_dir, songs[0]))
        elif 'the time' in query:
            str_time = datetime.datetime.now().strftime("%H:%M:%S")
            speak(f"The time is {str_time}")
        elif 'stop' in query:
            speak("Goodbye!")
            break

# import pyttsx3
# import speech_recognition as sr
# import datetime
# import wikipedia
# import webbrowser
# import os
#
# # Initialize text to speech engine
# engine = pyttsx3.init()
#
# def speak(audio):
#     engine.say(audio)
#     engine.runAndWait()
#
# def wish_me():
#     hour = datetime.datetime.now().hour
#     if 0 <= hour < 12:
#         speak("सुप्रभात!")
#     elif 12 <= hour < 18:
#         speak("शुभ अपराह्न!")
#     else:
#         speak("शुभ संध्या!")
#     speak("मैं जार्विस हूँ, मैं आपकी कैसे सहायता कर सकता हूँ?")
# engine.runAndWait()
#
# def take_command():
#     recognizer = sr.Recognizer()
#     with sr.Microphone() as source:
#         print("सुन रहा हूँ...")
#         recognizer.pause_threshold = 1
#         audio = recognizer.listen(source)
#     try:
#         print("पहचान रहा हूँ...")
#         query = recognizer.recognize_google(audio, language='hi-IN')
#         print(f"उपयोगकर्ता ने कहा: {query}")
#     except Exception as e:
#         print("कृपया फिर से बोलें...")
#         return "नहीं"
#     return query
#
# if __name__ == "__main__":
#     wish_me()
#     while True:
#         query = take_command().lower()
#         if 'विकिपीडिया' in query:
#             speak('विकिपीडिया खोज रहा हूँ...')
#             query = query.replace("विकिपीडिया", "")
#             results = wikipedia.summary(query, sentences=2)
#             speak("विकिपीडिया के अनुसार")
#             print(results)
#             speak(results)
#         elif 'यूट्यूब खोलो' in query:
#             speak("यूट्यूब के अनुसार")
#             engine.runAndWait()
#             webbrowser.open("youtube.com")
#         elif 'गूगल खोलो' in query:
#             webbrowser.open("google.com")
#         elif 'म्यूजिक चलाओ' in query:
#             music_dir = 'आपका\\म्यूजिक\\डायरेक्टरी'  # अपने म्यूजिक डायरेक्टरी में पाठ बदलें
#             songs = os.listdir(music_dir)
#             os.startfile(os.path.join(music_dir, songs[0]))
#         elif 'समय' in query:
#             str_time = datetime.datetime.now().strftime("%H:%M:%S")
#             speak(f"समय है {str_time}")
#         elif 'रोको' in query:
#             speak("अलविदा!")
#             break
#
