package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: androidx.core.view.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1943z {

    /* JADX INFO: renamed from: androidx.core.view.z$a */
    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f23276a;

        a(Menu menu) {
            this.f23276a = menu;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return AbstractC1943z.b(this.f23276a);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z$b */
    public static final class b implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Menu f23278b;

        b(Menu menu) {
            this.f23278b = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f23278b;
            int i10 = this.f23277a;
            this.f23277a = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23277a < this.f23278b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu menu = this.f23278b;
            int i10 = this.f23277a - 1;
            this.f23277a = i10;
            MenuItem item = menu.getItem(i10);
            if (item == null) {
                throw new IndexOutOfBoundsException();
            }
            menu.removeItem(item.getItemId());
        }
    }

    public static final Sequence a(Menu menu) {
        return new a(menu);
    }

    public static final Iterator b(Menu menu) {
        return new b(menu);
    }
}
