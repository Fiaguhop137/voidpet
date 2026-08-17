package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f20543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f20544b;

    private static final class a {
        @NonNull
        static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    B(TextView textView) {
        this.f20543a = (TextView) p199l1.g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f20544b;
        return textClassifier == null ? a.a(this.f20543a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f20544b = textClassifier;
    }
}
