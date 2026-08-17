package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f28221a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f28222b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f28223c = new ArrayList();

    static {
        new j(Looper.getMainLooper());
    }

    public static void a(Intent intent) {
        ArrayList<m> arrayList;
        synchronized (f28221a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<m> list = (List) f28222b.get(action);
                arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = null;
                    for (m mVar : list) {
                        if (!mVar.f28118c && mVar.f28116a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(mVar);
                            mVar.f28118c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((m) it.next()).f28118c = false;
                        }
                        arrayList = arrayList2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList == null) {
            return;
        }
        for (m mVar2 : arrayList) {
            if (!mVar2.f28119d) {
                mVar2.f28117b.a(intent);
            }
        }
    }

    public static void a(IntentFilter intentFilter, l lVar) {
        HashMap map = f28221a;
        synchronized (map) {
            try {
                m mVar = new m(intentFilter, lVar);
                ArrayList arrayList = (ArrayList) map.get(lVar);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(lVar, arrayList);
                }
                arrayList.add(mVar);
                Iterator<String> itActionsIterator = intentFilter.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    HashMap map2 = f28222b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(l lVar) {
        HashMap map = f28221a;
        synchronized (map) {
            try {
                List<m> list = (List) map.remove(lVar);
                if (list == null) {
                    return;
                }
                for (m mVar : list) {
                    mVar.f28119d = true;
                    Iterator<String> itActionsIterator = mVar.f28116a.actionsIterator();
                    while (itActionsIterator.hasNext()) {
                        String next = itActionsIterator.next();
                        List list2 = (List) f28222b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((m) it.next()).f28117b == lVar) {
                                    mVar.f28119d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                f28222b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
