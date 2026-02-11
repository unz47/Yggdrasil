# ミスリルブロック追加要件

## 基本情報
```yaml
ブロックID: mithril_block
ブロック名（日本語）: ミスリルブロック
ブロック名（英語）: Mithril Block
説明: ミスリルインゴット9個から作られる金属ブロック
```

## ブロックタイプ
```yaml
ブロックタイプ: 通常ブロック
```

## ブロック特性
```yaml
# 物理特性
硬度: 5.0
爆発耐性: 6.0
音: metal

# 採掘設定
適切なツール: pickaxe
必要ツールレベル: iron
ツール必須: Yes

# 光源
発光レベル: 0

# その他
ランダムティック: No
当たり判定: あり
透過性: No
可燃性: No
```

## ドロップ設定
```yaml
ドロップアイテム: 自分自身
ドロップ数: 1
シルクタッチ必須: No
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_建築ブロック
```

## クラフトレシピ
```yaml
# レシピ1: インゴットからブロックへ（圧縮）
クラフトレシピ1: あり
レシピタイプ: 作業台（有形）
パターン:
  行1: [mithril_ingot, mithril_ingot, mithril_ingot]
  行2: [mithril_ingot, mithril_ingot, mithril_ingot]
  行3: [mithril_ingot, mithril_ingot, mithril_ingot]
結果: mithril_block x 1

# レシピ2: ブロックからインゴットへ（解体）
クラフトレシピ2: あり
レシピタイプ: 無形クラフト
材料:
  - mithril_block x 1
結果: mithril_ingot x 9
```

## 精錬レシピ
```yaml
精錬レシピ: なし
```

## ブロックステート
```yaml
ブロックステート: なし
```

## テクスチャ
```yaml
テクスチャタイプ: 全面同じ
テクスチャファイル名: mithril_block.png
テクスチャパス: textures/block/metal/mithril_block.png
テクスチャサイズ: 16x16
```

## ブロックモデル
```yaml
モデルタイプ: 通常キューブ
```

## 特殊機能
```yaml
右クリック動作: なし
レッドストーン: なし
特殊能力: なし
```

## ワールド生成
```yaml
自然生成: なし
```

## 希少度
```yaml
希少度: Common
```

---

## 実装指示

上記のミスリルブロックを実装してください。

必要なファイル:
1. MetalBlocks.java - ブロック登録（MITHRIL_BLOCK追加）
2. MetalItems.java - ブロックアイテム登録（MITHRIL_BLOCK追加）
3. ModCreativeTabs.java - 建築ブロックタブに追加
4. assets/yggdrasil/blockstates/mithril_block.json
5. assets/yggdrasil/models/block/mithril_block.json
6. assets/yggdrasil/models/item/mithril_block.json
7. assets/yggdrasil/textures/block/metal/mithril_block.png
8. assets/yggdrasil/lang/ja_jp.json, en_us.json（翻訳追加）
9. data/yggdrasil/loot_tables/blocks/mithril_block.json
10. data/yggdrasil/recipes/metal/mithril_block_from_ingots.json
11. data/yggdrasil/recipes/metal/mithril_ingot_from_block.json
12. data/minecraft/tags/blocks/mineable/pickaxe.json（タグ追加）
13. data/minecraft/tags/blocks/needs_iron_tool.json（タグ追加）

前提: mithril_ingotが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
