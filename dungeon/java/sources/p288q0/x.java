package p288q0;

import O0.c;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface x {
    default int maxIntrinsicHeight(j jVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4059f((InterfaceC4062i) list.get(i11), k.Max, l.Height));
        }
        return mo0measure3p2s80s(new g(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(j jVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4059f((InterfaceC4062i) list.get(i11), k.Max, l.Width));
        }
        return mo0measure3p2s80s(new g(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    y mo0measure3p2s80s(k kVar, List list, long j10);

    default int minIntrinsicHeight(j jVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4059f((InterfaceC4062i) list.get(i11), k.Min, l.Height));
        }
        return mo0measure3p2s80s(new g(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(j jVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4059f((InterfaceC4062i) list.get(i11), k.Min, l.Width));
        }
        return mo0measure3p2s80s(new g(jVar, jVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
