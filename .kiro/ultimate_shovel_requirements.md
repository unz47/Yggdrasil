# アルティメットシャベル追加要件

## 基本情報
```yaml
アイテムID: ultimate_shovel
アイテム名（日本語）: アルティメットシャベル
アイテム名（英語）: Ultimate Shovel
説明: アダマンタイトとミスリルの力を融合させた究極のシャベル
```

## ツールタイプ
```yaml
ツールタイプ: シャベル
```

## ツール特性
```yaml
# 素材ティア設定
採掘レベル: 5  # ネザライトを超える
耐久値: 3000
採掘速度: 30.0
攻撃力ボーナス: 0
エンチャント適性: 18

# 武器特性
攻撃力: 12.0
攻撃速度: -3.0

# 採掘特性
適用ブロック: 土、砂、砂利、雪など
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
  行1: [air, mithril_ingot, air]
  行2: [air, adamantite_ingot, air]
  行3: [air, iron_ingot, air]

材料:
  - mithril_ingot x 1
  - iron_ingot x 2

結果: ultimate_shovel x 1
```

## 修繕
```yaml
修繕可能: No
```

## テクスチャ
```yaml
テクスチャファイル名: ultimate_shovel.png
テクスチャパス: textures/item/tool/ultimate_shovel.png
テクスチャサイズ: 16x16
3Dモデル: 通常
```

## 特殊機能
```yaml
特殊能力: なし
右クリック動作: なし
耐火性: Yes
発光: No
レアリティ: UNCOMMON
```

## デフォルトエンチャント
```yaml
エンチャント:
  - 耐久力 III (Unbreaking III)
  - 効率強化 V (Efficiency V)
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

上記のアルティメットシャベルを実装してください。

必要なファイル:
1. item/tool/UltimateShovelItem.java - シャベルアイテムクラス
2. item/tool/ToolItems.java - ツールアイテム登録に追加
3. ModCreativeTabs.java - ツールタブに追加
4. assets/yggdrasil/models/item/ultimate_shovel.json
5. assets/yggdrasil/textures/item/tool/ultimate_shovel.png
6. assets/yggdrasil/lang/ja_jp.json, en_us.json
7. data/yggdrasil/recipes/tool/ultimate_shovel.json

前提: mithril_ingot, ModToolTiers.ULTIMATEが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
