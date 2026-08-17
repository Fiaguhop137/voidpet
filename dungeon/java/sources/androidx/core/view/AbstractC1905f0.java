package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: androidx.core.view.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1905f0 {

    /* JADX INFO: renamed from: androidx.core.view.f0$a */
    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f23215a;

        a(ViewGroup viewGroup) {
            this.f23215a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return AbstractC1905f0.b(this.f23215a);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f0$b */
    public static final class b implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f23217b;

        b(ViewGroup viewGroup) {
            this.f23217b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f23217b;
            int i10 = this.f23216a;
            this.f23216a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23216a < this.f23217b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f23217b;
            int i10 = this.f23216a - 1;
            this.f23216a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final Sequence a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Iterator b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
