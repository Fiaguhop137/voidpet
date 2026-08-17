package expo.modules.updates.db;

import Ad.j;
import android.support.v4.media.session.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p122gd.n;
import p122gd.o;
import p122gd.p;
import p140hd.c;
import p140hd.d;
import p140hd.f;
import p183k3.q;
import p183k3.s;
import p219m3.e;
import p291q3.g;
import p291q3.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0010\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\u000f0\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$¨\u0006*"}, d2 = {"Lexpo/modules/updates/db/UpdatesDatabase_Impl;", "Lexpo/modules/updates/db/UpdatesDatabase;", "<init>", "()V", "Lk3/f;", "config", "Lq3/h;", "h", "(Lk3/f;)Lq3/h;", "Landroidx/room/c;", "g", "()Landroidx/room/c;", "", "Ljava/lang/Class;", "", "", "p", "()Ljava/util/Map;", "", "o", "()Ljava/util/Set;", "autoMigrationSpecs", "Ll3/a;", "j", "(Ljava/util/Map;)Ljava/util/List;", "Lhd/e;", "O", "()Lhd/e;", "Lhd/a;", "M", "()Lhd/a;", "Lhd/c;", "N", "()Lhd/c;", "Lkotlin/Lazy;", "A", "Lkotlin/Lazy;", "_updateDao", "B", "_assetDao", "C", "_jSONDataDao", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdatesDatabase_Impl extends UpdatesDatabase {

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy _updateDao = j.b(new n(this));

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy _assetDao = j.b(new o(this));

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy _jSONDataDao = j.b(new p(this));

    public static final class a extends s.b {
        a() {
            super(13);
        }

        @Override // k3.s.b
        public void a(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.i0("CREATE TABLE IF NOT EXISTS `updates` (`id` BLOB NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `scope_key` TEXT NOT NULL, `manifest` TEXT NOT NULL, `url` TEXT, `headers` TEXT, `launch_asset_id` INTEGER, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, `successful_launch_count` INTEGER NOT NULL DEFAULT 0, `failed_launch_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            db2.i0("CREATE INDEX IF NOT EXISTS `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
            db2.i0("CREATE UNIQUE INDEX IF NOT EXISTS `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
            db2.i0("CREATE TABLE IF NOT EXISTS `updates_assets` (`update_id` BLOB NOT NULL, `asset_id` INTEGER NOT NULL, PRIMARY KEY(`update_id`, `asset_id`), FOREIGN KEY(`update_id`) REFERENCES `updates`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            db2.i0("CREATE INDEX IF NOT EXISTS `index_updates_assets_asset_id` ON `updates_assets` (`asset_id`)");
            db2.i0("CREATE TABLE IF NOT EXISTS `assets` (`key` TEXT, `type` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `headers` TEXT, `extra_request_headers` TEXT, `metadata` TEXT, `download_time` INTEGER, `relative_path` TEXT, `hash` BLOB, `hash_type` INTEGER NOT NULL, `expected_hash` TEXT, `marked_for_deletion` INTEGER NOT NULL)");
            db2.i0("CREATE UNIQUE INDEX IF NOT EXISTS `index_assets_key` ON `assets` (`key`)");
            db2.i0("CREATE TABLE IF NOT EXISTS `json_data` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, `last_updated` INTEGER NOT NULL, `scope_key` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            db2.i0("CREATE INDEX IF NOT EXISTS `index_json_data_scope_key` ON `json_data` (`scope_key`)");
            db2.i0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            db2.i0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f2331836f27deacc936e75b3f1a360bd')");
        }

        @Override // k3.s.b
        public void b(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.i0("DROP TABLE IF EXISTS `updates`");
            db2.i0("DROP TABLE IF EXISTS `updates_assets`");
            db2.i0("DROP TABLE IF EXISTS `assets`");
            db2.i0("DROP TABLE IF EXISTS `json_data`");
            List list = ((q) UpdatesDatabase_Impl.this).f47885h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    b.a(it.next());
                    throw null;
                }
            }
        }

        @Override // k3.s.b
        public void c(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            List list = ((q) UpdatesDatabase_Impl.this).f47885h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    b.a(it.next());
                    throw null;
                }
            }
        }

        @Override // k3.s.b
        public void d(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            ((q) UpdatesDatabase_Impl.this).f47878a = db2;
            db2.i0("PRAGMA foreign_keys = ON");
            UpdatesDatabase_Impl.this.u(db2);
            List list = ((q) UpdatesDatabase_Impl.this).f47885h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    b.a(it.next());
                    throw null;
                }
            }
        }

        @Override // k3.s.b
        public void e(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        @Override // k3.s.b
        public void f(g db2) throws IOException {
            Intrinsics.checkNotNullParameter(db2, "db");
            p219m3.b.a(db2);
        }

        @Override // k3.s.b
        public s.c g(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            HashMap map = new HashMap(13);
            map.put("id", new e.a("id", "BLOB", true, 1, null, 1));
            map.put("commit_time", new e.a("commit_time", "INTEGER", true, 0, null, 1));
            map.put("runtime_version", new e.a("runtime_version", "TEXT", true, 0, null, 1));
            map.put("scope_key", new e.a("scope_key", "TEXT", true, 0, null, 1));
            map.put("manifest", new e.a("manifest", "TEXT", true, 0, null, 1));
            map.put("url", new e.a("url", "TEXT", false, 0, null, 1));
            map.put("headers", new e.a("headers", "TEXT", false, 0, null, 1));
            map.put("launch_asset_id", new e.a("launch_asset_id", "INTEGER", false, 0, null, 1));
            map.put("status", new e.a("status", "INTEGER", true, 0, null, 1));
            map.put("keep", new e.a("keep", "INTEGER", true, 0, null, 1));
            map.put("last_accessed", new e.a("last_accessed", "INTEGER", true, 0, null, 1));
            map.put("successful_launch_count", new e.a("successful_launch_count", "INTEGER", true, 0, "0", 1));
            map.put("failed_launch_count", new e.a("failed_launch_count", "INTEGER", true, 0, "0", 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new e.c("assets", "CASCADE", "NO ACTION", CollectionsKt.e("launch_asset_id"), CollectionsKt.e("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.C0581e("index_updates_launch_asset_id", false, CollectionsKt.e("launch_asset_id"), CollectionsKt.e("ASC")));
            hashSet2.add(new e.C0581e("index_updates_scope_key_commit_time", true, CollectionsKt.o("scope_key", "commit_time"), CollectionsKt.o("ASC", "ASC")));
            e eVar = new e("updates", map, hashSet, hashSet2);
            e.b bVar = e.f49053e;
            e eVarA = bVar.a(db2, "updates");
            if (!eVar.equals(eVarA)) {
                return new s.c(false, "updates(expo.modules.updates.db.entity.UpdateEntity).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }
            HashMap map2 = new HashMap(2);
            map2.put("update_id", new e.a("update_id", "BLOB", true, 1, null, 1));
            map2.put("asset_id", new e.a("asset_id", "INTEGER", true, 2, null, 1));
            HashSet hashSet3 = new HashSet(2);
            hashSet3.add(new e.c("updates", "CASCADE", "NO ACTION", CollectionsKt.e("update_id"), CollectionsKt.e("id")));
            hashSet3.add(new e.c("assets", "CASCADE", "NO ACTION", CollectionsKt.e("asset_id"), CollectionsKt.e("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new e.C0581e("index_updates_assets_asset_id", false, CollectionsKt.e("asset_id"), CollectionsKt.e("ASC")));
            e eVar2 = new e("updates_assets", map2, hashSet3, hashSet4);
            e eVarA2 = bVar.a(db2, "updates_assets");
            if (!eVar2.equals(eVarA2)) {
                return new s.c(false, "updates_assets(expo.modules.updates.db.entity.UpdateAssetEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
            }
            HashMap map3 = new HashMap(13);
            map3.put("key", new e.a("key", "TEXT", false, 0, null, 1));
            map3.put("type", new e.a("type", "TEXT", false, 0, null, 1));
            map3.put("id", new e.a("id", "INTEGER", true, 1, null, 1));
            map3.put("url", new e.a("url", "TEXT", false, 0, null, 1));
            map3.put("headers", new e.a("headers", "TEXT", false, 0, null, 1));
            map3.put("extra_request_headers", new e.a("extra_request_headers", "TEXT", false, 0, null, 1));
            map3.put("metadata", new e.a("metadata", "TEXT", false, 0, null, 1));
            map3.put("download_time", new e.a("download_time", "INTEGER", false, 0, null, 1));
            map3.put("relative_path", new e.a("relative_path", "TEXT", false, 0, null, 1));
            map3.put("hash", new e.a("hash", "BLOB", false, 0, null, 1));
            map3.put("hash_type", new e.a("hash_type", "INTEGER", true, 0, null, 1));
            map3.put("expected_hash", new e.a("expected_hash", "TEXT", false, 0, null, 1));
            map3.put("marked_for_deletion", new e.a("marked_for_deletion", "INTEGER", true, 0, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.C0581e("index_assets_key", true, CollectionsKt.e("key"), CollectionsKt.e("ASC")));
            e eVar3 = new e("assets", map3, hashSet5, hashSet6);
            e eVarA3 = bVar.a(db2, "assets");
            if (!eVar3.equals(eVarA3)) {
                return new s.c(false, "assets(expo.modules.updates.db.entity.AssetEntity).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
            }
            HashMap map4 = new HashMap(5);
            map4.put("key", new e.a("key", "TEXT", true, 0, null, 1));
            map4.put("value", new e.a("value", "TEXT", true, 0, null, 1));
            map4.put("last_updated", new e.a("last_updated", "INTEGER", true, 0, null, 1));
            map4.put("scope_key", new e.a("scope_key", "TEXT", true, 0, null, 1));
            map4.put("id", new e.a("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new e.C0581e("index_json_data_scope_key", false, CollectionsKt.e("scope_key"), CollectionsKt.e("ASC")));
            e eVar4 = new e("json_data", map4, hashSet7, hashSet8);
            e eVarA4 = bVar.a(db2, "json_data");
            if (eVar4.equals(eVarA4)) {
                return new s.c(true, null);
            }
            return new s.c(false, "json_data(expo.modules.updates.db.entity.JSONDataEntity).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p140hd.b S(UpdatesDatabase_Impl updatesDatabase_Impl) {
        return new p140hd.b(updatesDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d T(UpdatesDatabase_Impl updatesDatabase_Impl) {
        return new d(updatesDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f U(UpdatesDatabase_Impl updatesDatabase_Impl) {
        return new f(updatesDatabase_Impl);
    }

    @Override // expo.modules.updates.db.UpdatesDatabase
    public p140hd.a M() {
        return (p140hd.a) this._assetDao.getValue();
    }

    @Override // expo.modules.updates.db.UpdatesDatabase
    public c N() {
        return (c) this._jSONDataDao.getValue();
    }

    @Override // expo.modules.updates.db.UpdatesDatabase
    public p140hd.e O() {
        return (p140hd.e) this._updateDao.getValue();
    }

    @Override // p183k3.q
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "updates", "updates_assets", "assets", "json_data");
    }

    @Override // p183k3.q
    protected h h(p183k3.f config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config.f47849c.a(h.b.f51415f.a(config.f47847a).c(config.f47848b).b(new s(config, new a(), "f2331836f27deacc936e75b3f1a360bd", "b5440ed496eaba333f58c3ce160f54f8")).a());
    }

    @Override // p183k3.q
    public List j(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // p183k3.q
    public Set o() {
        return new HashSet();
    }

    @Override // p183k3.q
    protected Map p() {
        HashMap map = new HashMap();
        map.put(p140hd.e.class, f.f42846l.a());
        map.put(p140hd.a.class, p140hd.b.f42818l.a());
        map.put(c.class, d.f42840e.a());
        return map;
    }
}
