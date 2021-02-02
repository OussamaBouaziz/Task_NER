package nlp;

import edu.stanford.nlp.ie.machinereading.structure.Span;
import edu.stanford.nlp.simple.*;
import edu.stanford.nlp.simple.Document;
import edu.stanford.nlp.simple.Sentence;


public class SimpleCoreNLPDemo {
    public static void main(String[] args) {
        Sentence sent = new Sentence("your text should go here");
        sent.algorithms().headOfSpan(new Span(0, 2));
        // Create a document. No computation is done yet.
        Document doc = new Document("add your text here! It can contain multiple sentences.");
        for (Sentence sente : doc.sentences()) {  // Will iterate over two sentences
            // We're only asking for words -- no need to load any models yet
            System.out.println("The second word of the sentence '" + sent + "' is " + sent.word(1));
            // When we ask for the lemma, it will load and run the part of speech tagger
            System.out.println("The third lemma of the sentence '" + sent + "' is " + sent.lemma(2));
            // When we ask for the parse, it will load and run the parser
            System.out.println("The parse of the sentence '" + sent + "' is " + sent.parse());
            // ...
        }
    }
}
