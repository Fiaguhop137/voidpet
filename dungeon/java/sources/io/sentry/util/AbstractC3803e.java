package io.sentry.util;

import io.sentry.V2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.util.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3803e {
    public static boolean a(List list, V2 v10) {
        if (v10 != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.m mVarS0 = v10.s0();
            if (mVarS0 != null) {
                String strE = mVarS0.e();
                if (strE != null) {
                    hashSet.add(strE);
                }
                String strD = mVarS0.d();
                if (strD != null) {
                    hashSet.add(strD);
                }
            }
            Throwable thO = v10.O();
            if (thO != null) {
                hashSet.add(thO.toString());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(((io.sentry.F) it.next()).a())) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                io.sentry.F f10 = (io.sentry.F) it2.next();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    if (f10.b((String) it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
