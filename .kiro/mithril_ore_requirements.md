# ミスリル鉱石追加要件

## 基本情報
```yaml
ブロックID: mithril_ore
ブロック名（日本語）: ミスリル鉱石
ブロック名（英語）: Mithril Ore
説明: ミスリルを含む鉱石
```

## ブロック特性
```yaml
硬度: 4.0
爆破耐性: 3.0
採掘レベル: ダイヤツール以上
適正ツール: ツルハシ
音: 石
発光レベル: 0
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_ブロック
```

## ドロップ
```yaml
シルクタッチなし: mithril_ore x 1
シルクタッチあり: mithril_ore x 1
経験値: 0-2
```

## 精錬
```yaml
かまど: mithril_nugget x 1 (経験値 0.7)
溶鉱炉: mithril_nugget x 1 (経験値 0.7、時間半分)
```

## テクスチャ
```yaml
テクスチャファイル名: mithril_ore.png
テクスチャパス: textures/block/mithril_ore.png
テクスチャソース: 新規作成または提供
テクスチャサイズ: 16x16
```

## 生成設定
```yaml
ワールド生成: あり
生成バイオーム: 全バイオーム
生成高度: Y=-64 ~ Y=16
鉱脈サイズ: 1-3ブロック
チャンクあたり: 1鉱脈
生成確率: 低（ダイヤモンドと同等）
```

## 入手方法
```yaml
入手方法:
  - 採掘: Yes (ダイヤツルハシ以上)
  - クラフト: なし
  - モブドロップ: なし
  - チェスト戦利品: なし
```

---

## 実装指示

上記のミスリル鉱石を実装してください。

必要なファイル:
1. block/ModBlocks.java - ブロック登録クラス作成
2. ModItems.java - ブロックアイテム登録に対応
3. ModCreativeTabs.java - ブロックタブに追加
4. assets/yggdrasil/blockstates/mithril_ore.json
5. assets/yggdrasil/models/block/mithril_ore.json
6. assets/yggdrasil/models/item/mithril_ore.json
7. assets/yggdrasil/textures/block/mithril_ore.png
8. assets/yggdrasil/lang/ja_jp.json, en_us.json（翻訳追加）
9. data/yggdrasil/loot_tables/blocks/mithril_ore.json
10. data/minecraft/tags/blocks/mineable/pickaxe.json
11. data/minecraft/tags/blocks/needs_diamond_tool.json
12. data/yggdrasil/recipes/metal/mithril_nugget_from_ore_smelting.json（既存）
13. data/yggdrasil/recipes/metal/mithril_nugget_from_ore_blasting.json（既存）

前提: mithril_nuggetが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
