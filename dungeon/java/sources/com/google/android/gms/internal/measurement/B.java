package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class B implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2518k f32480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y1 f32481b;

    B(AbstractC2518k abstractC2518k, Y1 y10) {
        this.f32480a = abstractC2518k;
        this.f32481b = y10;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2572q interfaceC2572q = (InterfaceC2572q) obj;
        InterfaceC2572q interfaceC2572q2 = (InterfaceC2572q) obj2;
        if (interfaceC2572q instanceof C2616v) {
            return !(interfaceC2572q2 instanceof C2616v) ? 1 : 0;
        }
        if (interfaceC2572q2 instanceof C2616v) {
            return -1;
        }
        AbstractC2518k abstractC2518k = this.f32480a;
        return abstractC2518k == null ? interfaceC2572q.zzc().compareTo(interfaceC2572q2.zzc()) : (int) AbstractC2652z2.i(abstractC2518k.d(this.f32481b, Arrays.asList(interfaceC2572q, interfaceC2572q2)).a().doubleValue());
    }
}
