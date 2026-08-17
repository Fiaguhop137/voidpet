package K0;

import C0.B;
import C0.C0819d;
import android.text.Spannable;
import androidx.emoji2.text.j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static final void a(Spannable spannable, B b10, int i10, int i11, O0.d dVar) {
        Object[] spans = spannable.getSpans(i10, i11, j.class);
        for (Object obj : spans) {
            spannable.removeSpan((j) obj);
        }
        throw null;
    }

    public static final void b(Spannable spannable, List list, O0.d dVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0819d.c cVar = (C0819d.c) list.get(i10);
            android.support.v4.media.session.b.a(cVar.a());
            a(spannable, null, cVar.b(), cVar.c(), dVar);
        }
    }
}
