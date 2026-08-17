package p450z0;

import java.util.Comparator;
import kotlin.Pair;
import p019b0.g;

/* JADX INFO: loaded from: classes.dex */
final class G implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f58235a = new G();

    private G() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Pair pair, Pair pair2) {
        int iCompare = Float.compare(((g) pair.c()).h(), ((g) pair2.c()).h());
        return iCompare != 0 ? iCompare : Float.compare(((g) pair.c()).c(), ((g) pair2.c()).c());
    }
}
