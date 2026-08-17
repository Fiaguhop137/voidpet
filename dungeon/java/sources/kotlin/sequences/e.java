package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.E;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class e implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f48431a = new e();

    private e() {
    }

    @Override // kotlin.sequences.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(int i10) {
        return f48431a;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return E.f48231a;
    }
}
