package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3833z3 f44253a;

    public D3(C3833z3 c3833z3) {
        this.f44253a = c3833z3;
    }

    public static Boolean c(String str, List list, List list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public List a(StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.B b10 = new io.sentry.protocol.B();
                    b10.z(b(className));
                    b10.D(className);
                    b10.y(stackTraceElement.getMethodName());
                    b10.x(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        b10.B(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    b10.E(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(b10);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean b(String str) {
        return c(str, this.f44253a.getInAppIncludes(), this.f44253a.getInAppExcludes());
    }
}
