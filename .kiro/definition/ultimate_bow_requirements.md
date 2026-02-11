# アルティメット弓追加要件

## 基本情報
```yaml
アイテムID: ultimate_bow
アイテム名（日本語）: アルティメット弓
アイテム名（英語）: Ultimate Bow
説明: アダマンタイトとミスリルの力を融合させた究極の弓
```

## 武器タイプ
```yaml
武器タイプ: 弓
```

## 武器特性
```yaml
# 基本特性
耐久値: 3000
引き絞り時間: 0.1秒
矢の速度: 5.0（通常の弓の1.67倍）
ダメージ倍率: 3.0（通常の弓の3倍）
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_戦闘
```

## クラフトレシピ
```yaml
クラフトレシピ: あり
レシピタイプ: 作業台（有形）

パターン:
  行1: [air, adamantite_ingot, string]
  行2: [mithril_ingot, air, string]
  行3: [air, adamantite_ingot, string]

材料:
  - adamantite_ingot x 2
  - mithril_ingot x 1
  - string x 3

結果: ultimate_bow x 1
```

## 修繕
```yaml
修繕可能: No
```

## テクスチャ
```yaml
テクスチャファイル名: 
  - ultimate_bow.png（通常）
テクスチャパス: textures/item/tool/
テクスチャサイズ: 16x16
```

## 特殊機能
```yaml
特殊能力: 
  - 高速射撃
  - 高威力（ダメージ3倍）
  - 高速矢（速度1.67倍）
右クリック動作: 矢を射る
耐火性: Yes
発光: No
レアリティ: UNCOMMON
無限エンチャント対応: Yes
```

## デフォルトエンチャント
```yaml
エンチャント:
  - 耐久力 III (Unbreaking III)
  - パワー V (Power V)
  - 無限 I (Infinity I)
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

上記のアルティメット弓を実装してください。

必要なファイル:
1. item/tool/UltimateBowItem.java - 弓アイテムクラス
2. item/tool/ToolItems.java - ツールアイテム登録に追加
3. ModCreativeTabs.java - 戦闘タブに追加
4. assets/yggdrasil/models/item/ultimate_bow.json
5. assets/yggdrasil/models/item/ultimate_bow_pulling_0.json
6. assets/yggdrasil/models/item/ultimate_bow_pulling_1.json
7. assets/yggdrasil/models/item/ultimate_bow_pulling_2.json
8. assets/yggdrasil/textures/item/tool/ultimate_bow.png
9. assets/yggdrasil/textures/item/tool/ultimate_bow_pulling_0.png
10. assets/yggdrasil/textures/item/tool/ultimate_bow_pulling_1.png
11. assets/yggdrasil/textures/item/tool/ultimate_bow_pulling_2.png
12. assets/yggdrasil/lang/ja_jp.json, en_us.json
13. data/yggdrasil/recipes/tool/ultimate_bow.json

前提: adamantite_ingot, mithril_ingotが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
