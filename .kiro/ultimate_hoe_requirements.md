# アルティメットクワ追加要件

## 基本情報
```yaml
アイテムID: ultimate_hoe
アイテム名（日本語）: アルティメットクワ
アイテム名（英語）: Ultimate Hoe
説明: アダマンタイトとミスリルの力を融合させた究極のクワ
```

## ツールタイプ
```yaml
ツールタイプ: クワ
```

## ツール特性
```yaml
# 素材ティア設定
採掘レベル: 5  # ネザライトを超える
耐久値: 3000
採掘速度: 18.0  # ネザライトの2倍
攻撃力ボーナス: 0
エンチャント適性: 18

# 武器特性
攻撃力: 8.0
攻撃速度: -3.0

# 採掘特性
適用ブロック: 作物、葉など
効率: ネザライトの2倍
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_ツール
```

## クラフトレシピ
```yaml
クラフトレシピ: あり
レシピタイプ: 作業台（有形）

パターン:
  行1: [adamantite_ingot, mithril_ingot, air]
  行2: [air, iron_ingot, air]
  行3: [air, iron_ingot, air]

結果: ultimate_hoe x 1
```

## 修繕
```yaml
修繕可能: No
```

## テクスチャ
```yaml
テクスチャファイル名: ultimate_hoe.png
テクスチャパス: textures/item/tool/ultimate_hoe.png
テクスチャサイズ: 16x16
3Dモデル: 通常
```

## 特殊機能
```yaml
特殊能力: なし
右クリック動作: 耕地化（通常のクワと同じ）
耐火性: Yes
発光: No
レアリティ: UNCOMMON
```

## デフォルトエンチャント
```yaml
エンチャント:
  - 耐久力 III (Unbreaking III)
  - 効率強化 V (Efficiency V)
  - 修繕 I (Mending I)
```

## 入手方法
```yaml
入手方法:
  - クラフト: Yes
  - モブドロップ: なし
  - チェスト戦利品: なし
```

---

## 実装指示

上記のアルティメットクワを実装してください。

必要なファイル:
1. item/tool/UltimateHoeItem.java - クワアイテムクラス
2. item/tool/ToolItems.java - ツールアイテム登録に追加
3. ModCreativeTabs.java - ツールタブに追加
4. assets/yggdrasil/models/item/ultimate_hoe.json
5. assets/yggdrasil/textures/item/tool/ultimate_hoe.png
6. assets/yggdrasil/lang/ja_jp.json, en_us.json
7. data/yggdrasil/recipes/tool/ultimate_hoe.json

前提: mithril_ingot, ModToolTiers.ULTIMATEが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
