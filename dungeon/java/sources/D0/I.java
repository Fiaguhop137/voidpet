package D0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f2037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f2038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2040d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2041e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BoringLayout.Metrics f2042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f2044h;

    public I(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f2037a = charSequence;
        this.f2038b = textPaint;
        this.f2039c = i10;
    }

    private final float b() {
        BoringLayout.Metrics metricsE = e();
        float fCeil = metricsE != null ? metricsE.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(h(this, 0, 0, 3, null));
        }
        return J.d(fCeil, this.f2037a, this.f2038b) ? fCeil + 0.5f : fCeil;
    }

    private final float c() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.f2038b.getTextLocale());
        CharSequence charSequence = this.f2037a;
        int i10 = 0;
        lineInstance.setText(new C(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new H());
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.d()).intValue() - ((Number) pair.c()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float fG = g(((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            fG = Math.max(fG, g(((Number) pair3.getFirst()).intValue(), ((Number) pair3.getSecond()).intValue()));
        }
        return fG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.d()).intValue() - ((Number) pair.c()).intValue()) - (((Number) pair2.d()).intValue() - ((Number) pair2.c()).intValue());
    }

    private final CharSequence f() {
        CharSequence charSequence = this.f2044h;
        if (charSequence != null) {
            Intrinsics.c(charSequence);
            return charSequence;
        }
        if (!J.f2045a) {
            return this.f2037a;
        }
        CharSequence charSequenceE = J.e(this.f2037a);
        this.f2044h = charSequenceE;
        return charSequenceE;
    }

    private final float g(int i10, int i11) {
        return Layout.getDesiredWidth(f(), i10, i11, this.f2038b);
    }

    static /* synthetic */ float h(I i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = i10.f().length();
        }
        return i10.g(i11, i12);
    }

    public final BoringLayout.Metrics e() {
        if (!this.f2043g) {
            this.f2042f = C0916e.f2055a.c(this.f2037a, this.f2038b, j0.k(this.f2039c));
            this.f2043g = true;
        }
        return this.f2042f;
    }

    public final float i() {
        if (!Float.isNaN(this.f2040d)) {
            return this.f2040d;
        }
        float fB = b();
        this.f2040d = fB;
        return fB;
    }

    public final float j() {
        if (!Float.isNaN(this.f2041e)) {
            return this.f2041e;
        }
        float fC = c();
        this.f2041e = fC;
        return fC;
    }
}
