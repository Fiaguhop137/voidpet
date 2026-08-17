package G0;

import C0.N0;
import android.view.inputmethod.ExtractedText;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final ExtractedText a(G g10) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = g10.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = g10.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = N0.j(g10.g());
        extractedText.selectionEnd = N0.i(g10.g());
        extractedText.flags = !StringsKt.T(g10.h(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
