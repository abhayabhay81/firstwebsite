from googletrans import Translator

def translate_english_to_hindi(text):
    translator = Translator()
    translated_text = translator.translate(text, src='en', dest='hi')
    return translated_text.text

if __name__ == "__main__":
    english_text = "What is your name?"
    hindi_translation = translate_english_to_hindi(english_text)
    print("Hindi Translation:", hindi_translation)
